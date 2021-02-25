package com.example.roomtest2.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate

// Entity está indicando que uma classe será uma tabela, e dentro da class(tabela) Contato terão 4 campos.
@Entity
data class Contato(
    // @PrimaryKey --> indica que o id seja chave primária. autoGenerate = true --> serve para gerar automaticamente, igual ao auto_increment.
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,

    // @ColumnInfo(name = "nome") --> serve para, aqui ficar esse nome mais específico e na tabela, o nome do campo ficar mais genérico (você escolhe).
    @ColumnInfo(name = "nome")
    var nomeContato: String,

    @ColumnInfo(name = "telefone")
    var telefoneContato: String?
)