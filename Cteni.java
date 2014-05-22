/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kecalek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 *
 * @author martin
 */
/*
public class Cteni implements Runnable {
    private Socket client;
    private BufferedReader reader;
    private BufferedWriter writer;
    
    public Cteni (Socket client)
    {
        this.client=client;
    }
      public void Send (Paket paket) throws IOException
    {
        reader=new BufferedReader(new InputStreamReader (client.getInputStream()));  
        writer=new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
        writer.write(paket.PrevedNaText());
        writer.flush();
    }
    @Override
    public void run() {
       
        
        while (true)
      {
          try
          {
        reader=new BufferedReader(new InputStreamReader (client.getInputStream()));  
        writer=new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));

        String radek=reader.readLine();
        Paket p=new Paket (radek);
        switch (p.VratDruhOperace())
        {
            case PRIJMOUT_ZPRAVU:
                
                break;
            case PRIHLASENI_OK:
                
                break;
            case PRIHLASENI_ERR:
                break;
            case OBNOV_CL:
                
                break;
        }
          }
          catch (IOException e)
          {
              
          }
      }
    }
    
}
*/