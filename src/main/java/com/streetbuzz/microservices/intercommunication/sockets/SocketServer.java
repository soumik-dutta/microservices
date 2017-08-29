package com.streetbuzz.microservices.intercommunication.sockets;

import java.io.IOException;

/**
 *
 * Created by duttas16 on 7/18/2017.
 */
public class SocketServer  {
    //default port 8000
    private int port=8000;

    //constructor to set port
    public SocketServer(int  port) throws IOException {
        this.port = port;
    }

    /*ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
    serverSocketChannel.configureBlocking(true);
    serverSocketChannel.socket().bind(new InetSocketAddress(port) throws IOException);*/

}
