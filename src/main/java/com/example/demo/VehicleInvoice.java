package com.example.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;
import org.hibernate.annotations.JoinColumnOrFormula;
import org.hibernate.annotations.JoinFormula;

import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "INVOICE")
public class VehicleInvoice {

  @EmbeddedId
  private VehicleInvoiceId id;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumnOrFormula(formula = @JoinFormula(value = "trim(INVOICE_FIELD1)", referencedColumnName = "FIELD_1"))
  @JoinColumnOrFormula(column = @JoinColumn(name = "INVOICE_FIELD2", referencedColumnName = "FIELD_2", insertable = false, updatable = false))
  InvoicingAccountingVehicle vehicle;

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) {
      return false;
    }
    VehicleInvoice that = (VehicleInvoice) o;
    return id != null && Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}
