package com.example;

public class TASK5 {
    public static void main(String[] args) {
        // URL da API que estou chamando
        String apiUrl = "https://3ospphrepc.execute-api.us-west-2.amazonaws.com/prod/RDSLambda";
        String usuario = "interview";
        String senha = "2MLGz6q5py4mFNII";
        // Estabelecer conexão
        Connection conexao = DriverManager.getConnection(url, usuario, senha);

        // Criação de um cliente HTTP
        HttpClient httpClient = HttpClient.newHttpClient();

        // Criação da requisição
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(apiUrl))
                .GET()
                .build();

        try {
            // Envio da requisição e obtenção da resposta
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            // Exibição do código de status e do corpo da resposta
            System.out.println("Código de Status: " + response.statusCode());
            System.out.println("Resposta: " + response.body());

        } catch (Exception e) {
            e.printStackTrace();
        }

        try

        {

            // Query para inserir dados (substitua "sua_tabela" pelos detalhes da sua
            // tabela)
            String query = "INSERT INTO Employees (emp_no, birth_date, gender, hire_date) VALUES (?, ?, ?,?)";

            // Criar um objeto PreparedStatement para evitar injeção de SQL
            PreparedStatement preparedStatement = conexao.prepareStatement(query);

            // Substituir os valores nas posições dos placeholders (?) pelos seus dados
            // reais
            preparedStatement.setString(1, "valor_emp_no");
            // preparedStatement.setInt(2, 123); // Exemplo de um valor inteiro
            preparedStatement.setString(2, "valor_birth_date");
            preparedStatement.setString(3, "valor_gender");
            preparedStatement.setString(4, "valor_hire_date");

            // Executar a atualização no banco de dados
            int linhasAfetadas = preparedStatement.executeUpdate();

            // Verificar se a inserção foi bem-sucedida
            if (linhasAfetadas > 0) {
                System.out.println("Dados inseridos com sucesso!");
            } else {
                System.out.println("Falha ao inserir dados.");
            }

            // Fechar recursos
            preparedStatement.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        try

        {
            // Query para inserir dados (substitua "sua_tabela" pelos detalhes da sua
            // tabela)
            String query2 = "UPDATE Employees SET emp_no = VALUES ?, birth_date = VALUES ?, gender = VALUES ?, hire_date = VALUES ? WHERE emp_no >= 0 ";

            // Criar um objeto PreparedStatement para evitar injeção de SQL
            PreparedStatement preparedStatement = conexao.prepareStatement(query2);

            // Substituir os valores nas posições dos placeholders (?) pelos seus dados
            // reais
            preparedStatement.setString(1, "valor_emp_no");
            // preparedStatement.setInt(2, 123); // Exemplo de um valor inteiro
            preparedStatement.setString(2, "valor_birth_date");
            preparedStatement.setString(3, "valor_gender");
            preparedStatement.setString(4, "valor_hire_date");

            // Executar a atualização no banco de dados
            int linhasAfetadas = preparedStatement.executeUpdate();

            // Verificar se a inserção foi bem-sucedida
            if (linhasAfetadas > 0) {
                System.out.println("Dados atualizados com sucesso!");
            } else {
                System.out.println("Falha ao editar dados.");
            }

            // Fechar recursos
            preparedStatement.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
''
        try

        {
            // Query para inserir dados (substitua "sua_tabela" pelos detalhes da sua
            // tabela)
            String query3 = "Delete Employees WHERE  emp_no = VALUES ? ";

            // Criar um objeto PreparedStatement para evitar injeção de SQL
            PreparedStatement preparedStatement = conexao.prepareStatement(query3);

            // Substituir os valores nas posições dos placeholders (?) pelos seus dados
            // reais
            preparedStatement.setString(1, "valor_emp_no");
            // preparedStatement.setInt(2, 123); // Exemplo de um valor inteiro
            preparedStatement.setString(2, "valor_birth_date");
            preparedStatement.setString(3, "valor_gender");
            preparedStatement.setString(4, "valor_hire_date");

            // Executar a atualização no banco de dados
            // Fechar recursos
            preparedStatement.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        // Verificar se a inserção foi bem-sucedida
        if (linhasAfetadas > 0) {
            System.out.println("Dados Excluido com sucesso!");
        } else {
            System.out.println("Falha ao excluir dados.");
        }

        try {
            // Query para inserir dados (substitua "sua_tabela" pelos detalhes da sua
            // tabela)
            String query4 = "SELECT * FROM Employees";

            // Criar um objeto PreparedStatement para evitar injeção de SQL
            PreparedStatement preparedStatement = conexao.prepareStatement(query4);

            // Substituir os valores nas posições dos placeholders (?) pelos seus dados
            // reais
            preparedStatement.setString(1, "valor_emp_no");
            // preparedStatement.setInt(2, 123); // Exemplo de um valor inteiro
            preparedStatement.setString(2, "valor_birth_date");
            preparedStatement.setString(3, "valor_gender");
            preparedStatement.setString(4, "valor_hire_date");

            // Executar a atualização no banco de dados
            // Fechar recursos
            preparedStatement.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        // Verificar se a inserção foi bem-sucedida
        if (linhasAfetadas > 0) {
            System.out.println("Dados Selecionados com sucesso!");
        } else {
            System.out.println("Falha ao Selecionar dados.");
        }
    }

    int linhasAfetadas = preparedStatement.executeUpdate();
}
