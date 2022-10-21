package jandira.sp.senai.br.agenda.repository

import android.content.Context

import jandira.sp.senai.br.agenda.dao.ContactDB
import jandira.sp.senai.br.agenda.model.Contact

class ContactRepository(context: Context) {

    private val db = ContactDB.getDataBase(context).contactDao()

    fun save(contact: Contact): Long {

        return db.save(contact)

    }
    fun update(contact: Contact): Int {

        return db.update(contact)
    }
   fun delete(contact: Contact): Int {

        return db.delete(contact)

   }
    fun getAll(): List<Contact> {
        return db.getAll()

    }
    fun getContactById(id: Int): Contact {

        return db.getContactById(id)

    }


}