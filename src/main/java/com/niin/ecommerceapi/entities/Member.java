package com.niin.ecommerceapi.entities;

import lombok.Data;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "member")
public class Member extends AbstractPersistable<Long> {

   @Column(name = "name")
   private String name;


}