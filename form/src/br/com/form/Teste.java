package br.com.form;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.swing.JFrame;

import org.joda.time.DateTimeUtils.MillisProvider;
import org.joda.time.Hours;
import org.joda.time.Minutes;
import org.joda.time.Seconds;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.field.MillisDurationField;

public class Teste {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
			JFrame j = new JFrame("Upload de Arquivos");
			TelaPrincipal tp = new TelaPrincipal(j);
			tp.criaTela();
	}

}
