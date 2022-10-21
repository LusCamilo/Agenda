package jandira.sp.senai.br.agenda.model

import android.graphics.drawable.Drawable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate

@Entity(tableName = "tbl_contact") class Contact {

    @PrimaryKey var id = 0
    var nome = " "
    var telefone = " "
    var email = " "
    @ColumnInfo(name = "data_Nascimento") var dataNascimento:LocalDate? = null
    var foto: Drawable? = null


}