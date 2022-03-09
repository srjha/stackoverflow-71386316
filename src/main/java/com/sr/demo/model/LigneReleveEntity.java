package com.sr.demo.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "LIGNERELEVE")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LigneReleveEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	private Long ligneReleveId;
	private Date dateOperation;
	private String operationNature;
	private String rib;
	private int numCheck;
	private BigDecimal montant;
	private BigDecimal creditDebit;
	private int refDER;
	private int refPaiment;
	private String modePaiment;
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "idReleve")
	private ReleveBancaireEntity releveBancaire;

}
