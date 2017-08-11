package br.com.casadocodigo.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.xml.bind.annotation.XmlElement;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

import br.com.casadocodigo.type.TypeBook;

@Embeddable
public class Price {
	
	@Column(scale = 2)
	@NumberFormat(style = Style.CURRENCY, pattern = "#,###.###")
	private double price;
	
	@Column(name = "id_tp_bok")
	@Enumerated(EnumType.ORDINAL)
	private TypeBook typeBook;

	@XmlElement
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	@XmlElement
	public TypeBook getTypeBook() {
		return typeBook;
	}

	public void setTypeBook(TypeBook typeBook) {
		this.typeBook = typeBook;
	}
	
}
