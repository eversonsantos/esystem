package br.com.form;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class Janela extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JTable tbPilotos;
	private JTextField txtNomeArquivo = new JTextField();
	private DefaultTableModel modelTablePilotos = new DefaultTableModel();
	private DefaultTableModel modelTableVoltasPilotos = new DefaultTableModel();
	private JTable tbVoltasPilotos;
	private JButton btUpload = new JButton("Upload");
	private JFileChooser fileChooser = new JFileChooser();
	
	private PilotoService service = new PilotoService();
	private List<Piloto> pilotos = new ArrayList<Piloto>();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Janela() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 817, 474);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNomeArquivo.setEnabled(false);
		txtNomeArquivo.setBounds(5, 6, 504, 23);
		contentPane.add(txtNomeArquivo);
		txtNomeArquivo.setColumns(10);
		
		upload();
		
		btUpload.setBounds(519, 6, 140, 24);
		contentPane.add(btUpload);
		
		criaTablePilotos();
		
		getPilotoSelecionado();
		
		JScrollPane jScrollPane = new JScrollPane();
		jScrollPane.setBounds(5, 40, 803, 160);
		contentPane.add(jScrollPane);
		jScrollPane.setViewportView(tbPilotos);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(5, 205, 803, 160);
		contentPane.add(scrollPane);
		
		
		criaTableVoltasPilotos();
		
		scrollPane.setViewportView(tbVoltasPilotos);
	}
	
	private void getPilotoSelecionado(){
		tbPilotos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int rowSel = tbPilotos.getSelectedRow();
				modelTableVoltasPilotos.setNumRows(0);
				for (Volta volta : pilotos.get(rowSel).getVoltas()) {
					modelTableVoltasPilotos.addRow(new Object[]{volta.getHrVolta(), volta.getNrVolta(), volta.getTmVolta(), volta.getVlMedia()});
				}
			}
		});
		
	}
	private void upload(){
		btUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
		        int value = fileChooser.showOpenDialog(null);
		        if (value == JFileChooser.APPROVE_OPTION) {
		          try {
		        	  if(!fileChooser.getSelectedFile().getName().endsWith(".txt")){
		        		  JOptionPane.showMessageDialog(null,
		  						"Somente .txt serão aceitos");  
		        	  }else {
						InputStream is = new FileInputStream(fileChooser.getSelectedFile());
						txtNomeArquivo.setText(fileChooser.getSelectedFile().getAbsolutePath().toUpperCase());
						String content = service.parseFileToString(is);
			        	pilotos.addAll(service.parseStringToPilotos(content));
			        	for (Piloto piloto : pilotos) {
			    			modelTablePilotos.addRow(new Object[]{piloto.getNrPosicaoFormatado(), piloto.getCdPil()+" - "+piloto.getNmPil(), piloto.getTmMelhorVolta(), piloto.getNrMelhorVolta(), piloto.getTmTotalProva(), piloto.getTmProvaAposGanhador()});
			    		}
			        	tbPilotos.setModel(modelTablePilotos);
		        	  }
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					}
		        }
			}
		});
	}
	
	public void criaTableVoltasPilotos(){
		tbVoltasPilotos = new JTable();
		modelTableVoltasPilotos.setColumnIdentifiers(new String[]{"Hora Volta", "Nº Volta", "Tempo", "Velocidade Média"});
		tbVoltasPilotos.setModel(modelTableVoltasPilotos);
		
	}
	public void criaTablePilotos(){
		tbPilotos = new JTable();
		modelTablePilotos.setColumnIdentifiers(new String[] {
				"Posição", "Piloto", "Melhor Volta", "Nº Volta", "Velocidade Média", "Tempo Prova", "Tempo Após Ganhador"
		});
		tbPilotos.setModel(modelTablePilotos);
		tbPilotos.setBounds(5, 35, 679, 143);
		tbPilotos.getColumnModel().getColumn(0).setPreferredWidth(3);
		tbPilotos.getColumnModel().getColumn(1).setPreferredWidth(50);
		tbPilotos.getColumnModel().getColumn(2).setPreferredWidth(15);
		tbPilotos.getColumnModel().getColumn(3).setPreferredWidth(5);
		tbPilotos.getColumnModel().getColumn(4).setPreferredWidth(30);
		tbPilotos.getColumnModel().getColumn(5).setPreferredWidth(15);
		tbPilotos.getColumnModel().getColumn(6).setPreferredWidth(30);
	}
}
