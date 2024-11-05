import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class NavegadorDeRegistro extends TelaDePesquisa {
    public static String registroDePesquisa = "";
    public static String clausulasDePesquisaComWhere= "";
    public static String clausulasDePesquisaSemWhere= "";

    public static void registrarPesquisa(){
        registroDePesquisa = txtPesquisa.getText().trim();
        if ((registroDePesquisa.length() > 0)) {
            clausulasDePesquisaComWhere = " where `nome` like '%" + registroDePesquisa + "%' or `email` like '%"
            + registroDePesquisa + "%'";
            clausulasDePesquisaSemWhere = " and (`nome` like '%" + registroDePesquisa + "%' or `email` like '%" 
            + registroDePesquisa + "%')";
        }
        vaParaPrimeiroRegistro();
    }
    
    
    public static void inicializacaoDeRegistros() {
        vaParaPrimeiroRegistro();
    }

    public static void vaParaPrimeiroRegistro() {
        try {
            String strSqlInicializacao = "select * from `login`.`tbl_login` " + clausulasDePesquisaComWhere + " order by `id` asc;";
            Connection conexao = MySQLConnector.conectar();
            Statement stmSqlInicializacao = conexao.createStatement();
            ResultSet rstSqlInicializacao = stmSqlInicializacao.executeQuery(strSqlInicializacao);
            if (rstSqlInicializacao.next()) {
                txtId.setText(rstSqlInicializacao.getString("id"));
                txtNome.setText(rstSqlInicializacao.getString("nome"));
                txtEmail.setText(rstSqlInicializacao.getString("email"));
                notificarUsuario("Primeiro registro posicionado com sucesso!");
                habilitarAvancar();
            } else {
                notificarUsuario("Não foram encontrados registros.");
            }
            stmSqlInicializacao.close();
        } catch (Exception e) {
            notificarUsuario("Ops! Houve um problema no servidor e não será possível inicializar os registros no momento. Por favor, retorne novamente mais tarde.");
            System.err.println("Erro: " + e);
        }
    }

    public static void vaParaProximoRegistro() {
        try {
            String strSqlInicializacao = "select * from `login`.`tbl_login` where `id` > "  + txtId.getText() + clausulasDePesquisaSemWhere + " order by `id` asc;";
            Connection conexao = MySQLConnector.conectar();
            Statement stmSqlInicializacao = conexao.createStatement();
            ResultSet rstSqlInicializacao = stmSqlInicializacao.executeQuery(strSqlInicializacao);
            if (rstSqlInicializacao.next()) {
                txtId.setText(rstSqlInicializacao.getString("id"));
                txtNome.setText(rstSqlInicializacao.getString("nome"));
                txtEmail.setText(rstSqlInicializacao.getString("email"));
                notificarUsuario("Registro anterior posicionado com sucesso!");
                habilitarTodos();
            } else {
                habilitarVoltar();
                notificarUsuario("Não foram encontrados registros.");
            }
        } catch (Exception e) {
            notificarUsuario("Ops! Houve um problema no servidor e não será possível inicializar os registros no momento. Por favor, retorne novamente mais tarde.");
            System.err.println("Erro: " + e);
        }
    }

    public static void vaParaRegistroAnterior() {
        try {
            String strSqlInicializacao = "select * from `login`.`tbl_login` where `id` < "  + txtId.getText() + clausulasDePesquisaSemWhere + " order by `id` desc;";
            Connection conexao = MySQLConnector.conectar();
            Statement stmSqlInicializacao = conexao.createStatement();
            ResultSet rstSqlInicializacao = stmSqlInicializacao.executeQuery(strSqlInicializacao);
            if (rstSqlInicializacao.next()) {
                txtId.setText(rstSqlInicializacao.getString("id"));
                txtNome.setText(rstSqlInicializacao.getString("nome"));
                txtEmail.setText(rstSqlInicializacao.getString("email"));
                notificarUsuario("Registro anterior posicionado com sucesso!");
                habilitarTodos();
            } else {
                habilitarAvancar();
                notificarUsuario("Não foram encontrados registros.");
            }
        } catch (Exception e) {
            notificarUsuario("Ops! Houve um problema no servidor e não será possível inicializar os registros no momento. Por favor, retorne novamente mais tarde.");
            System.err.println("Erro: " + e);
        }
    }

    public static void vaParaUltimoRegistro() {
        try {
            String strSqlInicializacao = "select * from `login`.`tbl_login` order by `id` desc;";
            Connection conexao = MySQLConnector.conectar();
            Statement stmSqlInicializacao = conexao.createStatement();
            ResultSet rstSqlInicializacao = stmSqlInicializacao.executeQuery(strSqlInicializacao);
            if (rstSqlInicializacao.next()) {
                txtId.setText(rstSqlInicializacao.getString("id"));
                txtNome.setText(rstSqlInicializacao.getString("nome"));
                txtEmail.setText(rstSqlInicializacao.getString("email"));
                notificarUsuario("Registro anterior posicionado com sucesso!");
                habilitarVoltar();
            } else {
                
                notificarUsuario("Não foram encontrados registros.");
            }
        } catch (Exception e) {
            notificarUsuario("Ops! Houve um problema no servidor e não será possível inicializar os registros no momento. Por favor, retorne novamente mais tarde.");
            System.err.println("Erro: " + e);
        }
    }

    
}