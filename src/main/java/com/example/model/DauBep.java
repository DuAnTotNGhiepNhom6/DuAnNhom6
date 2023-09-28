package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name = "daubep")
@Getter
@Setter
public class DauBep {
	@Id
	Integer id_daubep;
	String tendaubep;
	String avatar_daubep;
	String gioithieu;
	Boolean gioitinh;
	
}
