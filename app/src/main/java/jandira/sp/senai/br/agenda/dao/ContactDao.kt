package jandira.sp.senai.br.agenda.dao

import androidx.room.*
import jandira.sp.senai.br.agenda.model.Contact

@Dao interface ContactDao {


    @Insert fun save(contact: Contact): Long




    @Delete fun delete(contact: Contact): Int




    @Update fun  update(contact: Contact): Int




    @Query("select * from tbl_contact order by nome") fun getAll(): List<Contact>




    @Query("select * from tbl_contact where id = :id") fun getContactById(id: Int): Contact







}