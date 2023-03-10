package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "INV_VEHICLE")
public class InvoicingAccountingVehicle extends AbstractInvoicingAccountingVehicle implements Serializable {

  private static final long serialVersionUID = 1L;
}
