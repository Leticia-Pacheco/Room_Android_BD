package com.example.roomtest2.dao

import androidx.room.*
import com.example.roomtest2.model.Contato

// Para o Room entender que ele deve executar também
@Dao
interface ContatoDao {

    // Insert no banco.
    @Insert
    fun salvar(contato: Contato)

    // Para editar o contato
    @Update
    fun atualizar(contato: Contato)

    // Listar todos os contatos no banco
    @Query("SELECT * FROM Contato ORDER BY nome ASC")
    fun listarTodos() : List<Contato>

    // Buscar contato pelo id
    @Query("SELECT * FROM contato WHERE id = :id")
    fun listarPorId(id: Int) : Contato

    @Delete
    fun excluir(contato: Contato)
}