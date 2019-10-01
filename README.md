# Hacktoberfest-2019
Repo aberto para submissões do hacktoberfest 2019
## Como participar? 
Primeiro é necessário que você se cadastre o próprio site do eveto
https://hacktoberfest.digitalocean.com/


### Faça uma cópia desse repositório por meio do botão fork:

![](https://github.com/lucasmarinzeck/Hacktoberfest-2019/blob/master/prints/Screenshot%20from%202019-09-30%2022-48-40.png)


### Baixe o git na sua máquina ###
Caso use Linux basta usar o comando referente ao seu package manager de uso por exemplo

```
sudo apt-get install git
```
Caso sua plataforma seja Windows pode baixar pelo site https://git-scm.com/downloads

para ver se a instalação do git funcionou rode 
git --version
### Configure seu usúario com os comando abaixo: ###
```
* git config --global user.name "Seu Nome"
* git config --global user.email seuemail@examplo.com
```

### Clone a cópia do repositório para a sua máquina local
 No terminal digite o seguinte comando "git clone URL" Substitua URL pela url da página de clone do projeto original.
 Por exemplo "git clone https://github.com/seunome/Hacktoberfest-2019"
 
 
 ![](https://github.com/lucasmarinzeck/Hacktoberfest-2019/blob/master/prints/Screenshot%20from%202019-10-01%2000-17-02.png)
 
 ### Faça alterações na cópia do projeto na sua máquina local 
 
 Crie um arquivo txt com o seu nome dentro da pasta do projeto
 
No termial, após as alterações rode o comando __git status__. Em resumo esse comando irá listar o status do seu repositório local, que pode conter alguns estatos como staged, untracked, modified e entre outros.
Provavelmente a saída desse comando irá retornar que o arquivo que você alterou está "Untracked".


![](https://github.com/lucasmarinzeck/Hacktoberfest-2019/blob/master/prints/Screenshot%20from%202019-10-01%2000-17-43.png)


Para salvar essa mudança e compartilhar com os outros que irão contribuir para o mesmo repositório escreva no terminal __git add nome do arquivo modificado__, isso irá mudar o estado dessa mudança para a área de "espera" digamos assim. após conferir que está tudo correto novamente com __git status__, podemos finalmente salvar a mudança na sua máquina. Rode o comando __git commit -m 'Adicionando minhas mudanças'__.
Ao rodar __git status__ veremos que em nosso repositório está tudo beme agora precisamos passar nossas atualizações para o repositório remoto que é o Github.


![](https://github.com/lucasmarinzeck/Hacktoberfest-2019/blob/master/prints/Screenshot%20from%202019-10-01%2000-18-03.png)


![](https://github.com/lucasmarinzeck/Hacktoberfest-2019/blob/master/prints/Screenshot%20from%202019-10-01%2000-18-41.png)


### Enviando nossas atualizações para Github
Com o comando __git push origin master__ enviaremos todas as mudanças feitas e salvas pelo último commit para o servidor do github.
O terminal irá pedir seu nome de usuario do github e sua senha do mesmo.


![](https://github.com/lucasmarinzeck/Hacktoberfest-2019/blob/master/prints/Screenshot%20from%202019-10-01%2000-19-16.png)

 ### Nosso primeiro Pull Request
 
Um pull request nada mais é que um pedido para o moderador do projeto que clonou via Fork para aceitar suas mudanças e implementa-las no projeto original

Para isso volte ao Github, na sua página do clone do projeto e procure pelo botão "New Pull Request"

Por exemplo:

![](https://github.com/lucasmarinzeck/Hacktoberfest-2019/blob/master/prints/Screenshot%20from%202019-09-30%2023-47-39.png)

Confirme o Pull Request clicando em Create Pull Request

![](https://github.com/lucasmarinzeck/Hacktoberfest-2019/blob/master/prints/Screenshot%20from%202019-09-30%2023-47-53.png)


## Pronto, você realizou um dos 4 Pull Requests necessários para a camisa
Basta repetir o processo alterando o ou adicionando o seu arquivo, mandando para o github (git add, git commit, git push origin master) e por fim enviando o pull request (New Pull Request)

pode acompanhar sua contagem de Pull requests pelo site https://hacktoberfest.digitalocean.com/
