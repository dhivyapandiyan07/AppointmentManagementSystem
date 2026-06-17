
package com.appointment.entity;
import jakarta.persistence.*; import lombok.*;
@Entity @Data public class Doctor{
@Id @GeneratedValue(strategy=GenerationType.IDENTITY) Long id;
String name; String specialization;
}
