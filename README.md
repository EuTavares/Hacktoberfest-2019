# Hacktoberfest-2019
Repo aberto para submissões do hacktoberfest 2019
## Como participar? 
Primeiro é necessário que você se cadastre o próprio site do eveto
https://hacktoberfest.digitalocean.com/


### Faça uma cópia desse repositório por meio do fork:

![alt text](https://raw.githubusercontent.com/username/projectname/branch/path/to/img.png)

### Baixe o git na sua máquina ###
Caso use Linux basta usar o comando referente ao seu package manager de uso por exemplo

```
sudo apt-get install git
```

para ver se a istalação do git funcionou rode 
git --version
### Configure seu usúario com os comando abaixo: ###
```
* git config --global user.name "Seu Nome"
* git config --global user.email seuemail@examplo.com
```

### Clone a cópia do repositório para a sua máquina local
 No terminal digite o seguinte comando
 git clone url do seu repositório remoto
 
 ### Faça alterações na cópia do projeto na sua máquina local 
 Pode ser qualquer tippo de alteração. Por exemplo escreva seu nome ao final da linha do arquivo de contribuição
 
No termial, após as alterações rode o comando __git status__. Em resumo esse comando irá listar o status do seu repositório local, que pode conter alguns estatos como staged, untracked, modified e entre outros.
Provavelmente a saída desse comando irá retornar que o arquivo que você alterou está "modified". Para salvar essa mudança e compartilhar com os outros que irão contribuir para o mesmo repositório escreva no terminal __git add nome do arquivo modificado__, isso irá mudar o estado dessa mudança para a área de "espera" digamos assim. após conferir que está tudo correto novamente com __git status__, podemos finalmente salvar a mudança na sua máquina. Rode o comando __git commit -m 'Adicionando minhas mudanças'__.
Ao rodar __git status__ veremos que em nosso repositório está tudo beme agora precisamos passar nossas atualizações para o repositório remoto que é o Github.

### Enviando nossas atualizações para Github
Com o comando __git push origin master__ enviaremos todas as mudanças feitas e salvas pelo último commit para o servidor do github
```
git push origin master
Entre com o nome da sua conta no Github
Entre com sua senha 
```
 ### Nosso primeiro Pull Request
 
Um pull request nada mais é que um pedido para o moderador do projeto que clonou via Fork para aceitar suas mudanças e implementa-las no projeto original
