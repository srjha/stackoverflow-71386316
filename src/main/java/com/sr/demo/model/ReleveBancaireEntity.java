package com.sr.demo.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "RELEVEBANCAIRE")
@Entity
public class ReleveBancaireEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	private Long releveBancaireId;
	private Date dateReception;
	private String label;
	private int nbrLignes;
	private int nbrOperationCredit;
	private int nbrOperationDebit;
	private BigDecimal soldeInitial;
	private BigDecimal soleFinal;
	@OneToMany(mappedBy = "releveBancaire", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
	@JacksonXmlProperty(localName = "lignereleve")
	@JacksonXmlElementWrapper(useWrapping = false)
	private List<LigneReleveEntity> lignereleve;
}
