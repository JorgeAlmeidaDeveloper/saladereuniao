/* criação da classe model com os atributos para o acesso a sala de reunião
foram importados os pacotes para ajudar na implementação dos metodos.
*/

package com.digitalcrud.salareuniao.saladereuniao.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name ="meetingroom")
@Getter
@Setter
public class Room {

    //Valida a variavel ID como principal no banco e gerar o valor automatico
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
   //Gerar colunas no banco com o nome da variavel

    @Column(name = "name",nullable = false)
    private String name;
    @Column(name = "date",nullable = true)
    private String date;
    @Column(name = "startHour",nullable = false)
    private String startHour;
    @Column(name = "endHour",nullable = false)
    private String endHour;

    //converte as variaveis para string onde vai falicitar no front-end
   @Override
    public String toString(){
        return "Room {id="+id+",name="+name+ ",startHour="+ startHour+ ",endHour=+"+ endHour+ "]";
    }

    //Criação dos Construtores para acesar essa classe
    public Room(){

    }

    //Criação dos Construtores para acesar essa classe com as variaveis
    public Room(long id, String name, String date,String startHour, String endHour){
    this.id=id;
    this.name=name;
    this.date=date;
    this.startHour=startHour;
    this.endHour=endHour;
    }




}
