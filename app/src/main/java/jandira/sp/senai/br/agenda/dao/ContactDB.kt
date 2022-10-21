package jandira.sp.senai.br.agenda.dao

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import jandira.sp.senai.br.agenda.model.Contact

@Database(entities = [Contact::class],  version = 1)
abstract class ContactDB: RoomDatabase() {

    abstract fun  contactDao(): ContactDao

    companion object {

        private lateinit var instance: ContactDB

        fun getDataBase(context: Context): ContactDB{

            if (!::instance.isInitialized) {

                instance = Room.databaseBuilder(context, ContactDB::class.java, "db_agenda").allowMainThreadQueries().build()

            }
            return  instance
        }
    }

}