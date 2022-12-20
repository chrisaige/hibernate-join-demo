package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class VehicleInvoiceId implements Serializable {

  private static final long serialVersionUID = 1L;

  @Column(name = "INVOICE_FIELD1", length = 2, nullable = false, columnDefinition = "CHAR(2 CHAR)")
  private char[] field1;

  @Column(name = "INVOICE_FIELD2", length = 2, nullable = false, columnDefinition = "CHAR(4 CHAR)")
  private char[] field2;

  @Column(name = "ADDITIONAL_FIELD", nullable = false)
  private Integer additionalField;
}
