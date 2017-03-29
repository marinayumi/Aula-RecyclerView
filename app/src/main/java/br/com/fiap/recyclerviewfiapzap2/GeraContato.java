package br.com.fiap.recyclerviewfiapzap2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by logonrm on 29/03/2017.
 */

public class GeraContato {

    public static List<Contato> listaContatos(){
        List<Contato> contatos = new ArrayList<>();
        contatos.add(new Contato("Marina", "11 1111-1111", "Olá", R.drawable.icon1));
        contatos.add(new Contato("Tom", "22 2222-2222", "Olá", R.drawable.icon2));
        contatos.add(new Contato("Ricardo", "33 3333-3333", "Olá", R.drawable.icon3));

        return contatos;

    }
}
