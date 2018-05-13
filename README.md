# workshop-ibm-selenium-1

Projeto (parte 1) com a ferramenta Selenium para desenvolvimento de um workshop a ser realizado para os colegas da IBM.

Projeto realizado por: Savanna Denega e Sonja.

Este projeto utiliza do padrão Singleton entre as classes.
Este projeto não utiliza a ferramenta para build Maven, então já adicionamos todas as dependêcias necessárias. Não utilizamos neste projeto a ferramenta para build Maven para facilitar a configuração dos computadores dos colegas no momento da realização do workshop (por problemas de configuração de PROXY/VPN ou não possuir o Maven já configurado no computador).

Os testes são realizados no site [http://book.theautomatedtester.co.uk/chapter1](http://book.theautomatedtester.co.uk/chapter1), que já é um site destinado para testes com a ferramenta Selenium.

A ordem dos testes é realizada de acordo com a imagem abaixo:

![order-testes](readme-images/order-tests-project1.png)


### Recursos utilizados:

- Selenium Server
- Selenium Java
- Selenium Chrome Driver
- TestNG
- TestNG Eclipse Plugin

### Como configurar o ambiente:

- Faça clone do projeto;
- Importe o projeto para o Eclipse no modelo "Existing Projects into Workspace";

#### Para configurar o plugin TestNG no Eclipse:

- Faça download dos arquivos Jar TestNG no link abaixo:
[https://dl.bintray.com/testng-team/testng-eclipse-release/zipped/6.11.0.201703011520/site_assembly.zip](https://dl.bintray.com/testng-team/testng-eclipse-release/zipped/6.11.0.201703011520/site_assembly.zip)
Este é a URL direta pra download do TestNG versão 6.11.
- Você irá fazer download do arquivo ´site_assembly.zip´. Este arquivo contém duas pastas com os nomes ´features´ e ´plugin´;
A pasta ´features´ contém os dois arquivos descritos abaixo:
    org.testng.eclipse.maven.feature_6.11.0.201703011520.jar
    org.testng.eclipse_6.11.0.201703011520.jar
A pasta ´plugin´ contém os dois arquivos descritos abaixo:
    org.testng.eclipse.maven_6.11.0.201703011520.jar
    org.testng.eclipse_6.11.0.201703011520.jar
Nota: você pode procurar por recentes atualizações do TestNG [aqui](https://github.com/cbeust/testng-eclipse).
- Vá até o diretório onde está a instalação do Eclipse e procure pela pasta ´dropins´;
- Crie uma subpasta nesta pasta ´dropins´ com o nome ´testng-eclipse-6.11´;
- Extraia o arquivo recém baixado ´site_assembly.zip´ dentro desta pasta ´testng-eclipse-6.11´, deixando apenas as pastas ´features´ e ´plugin´;
A estrutura das pastas deverá ficar assim:
´´eclipse\
     dropins\
        testng-eclipse-6.11\
            features\
               org.testng.eclipse.maven.feature_6.11.0.201703011520.jar
               org.testng.eclipse_6.11.0.201703011520.jar 
            plugins\
               org.testng.eclipse.maven_6.11.0.201703011520.jar
               org.testng.eclipse_6.11.0.201703011520.jar
´´
Nota: Este procedimento foi realizado na versão do Eclipse Neon.

- Você vai precisar reiniciar ou iniciar o Eclipse (caso esteja com ele fechado), para que o plugin do TestNG possa ser carregado;
- Com o Eclipse aberto, pressione ´CTRL+N´, assim você irá abrir um ´New´ Wizard. Esta tela irá carregar a lista dos templates de módulo/projetos disponíveis. 
- Filtre por "TestNG", selecione `TestNG Class`, clique em `Next`;
- Selecione as classes disponíveis que utilizam o TestNG que neste caso são `Chapter1TestCase` e `WebDriverInstance` e depois clique em `Finish`.

Pronto, seu ambiente está configurado.


	
