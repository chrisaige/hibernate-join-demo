package com.example.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class AbstractInvoicingAccountingVehicle {

  @Id
  @Column(name = "ID", nullable = false, columnDefinition = "NUMBER(11,0)")
  private Long vehicleId;

  @Column(name = "FIELD_1", nullable = false, length = 2, columnDefinition = "VARCHAR2(2 CHAR)")
  private String field1;

  @Column(name = "FIELD_2", nullable = false, length = 4, columnDefinition = "VARCHAR2(4 CHAR)")
  private String field2;
}
