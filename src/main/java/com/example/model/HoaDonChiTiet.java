package com.example.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name = "Hoadonchitiet")
@Getter
@Setter
public class HoaDonChiTiet {
	@Id
	Integer id_hoadon;
	Integer giamgia;
	float thue;
	float tongtien;
	@Temporal(TemporalType.DATE)
	@Column(name = "Ngaydat")
	Date ngaylaphoadon = new Date();
}
