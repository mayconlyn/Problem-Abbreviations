# Problema: Abbreviations
URI Online Judge | 1519 By Cristhian Bonilha, UTFPR BR Brazil
https://www.urionlinejudge.com.br/judge/en/problems/view/1519

# Descrição
Blogs are very popular nowadays, and there are tools that allows you to maintain your blog for free. Rafael then decided to create a blog, where he is going to post all his daily experiences of his life.

For these free tools, there are characters limits that you can write each day, and Rafael is worried that this limitation will prevent him of telling his best experiences. He decided then to use a word abbreviation system in his posts.

The word abbreviation system works as follows: for each letter, it is possible to choose one word that has such initial letter and that appears in the post. Once the word is chosen, every time it appears in the post, it will be replaced by its initial letter and a point, then decreasing the number of characters printed at the screen.

For example, in the phrase: “today I visited my parents”, we can choose the word “visited” to represent letter 'v', and the phrase will be like this: “today I v. my parents”, saving five letters. One word can appear more than once in the text, and will be abbreviated every time. Notice that, if after an abbreviation the number of characters does not decrease, then it should not be abbreviated, as with the word “my” above.

Rafael needs his post to have the less number of characters as possible, and because of that he asked your help. For each letter choose a word, in a way that after the abbrevations are applied, the post will have as less characters as possible.
## Entrada
There will be several test cases. Each test case is composed of one line, containing one phrase up to 10⁴ characters. The phrase is composed of words and white spaces, and each word is composed of lower case letters ('a'-'z'), and has between 1 and 30 characters each.

The last test case is indicated when the given line has only one “.”, which should not be processed.
## Saída
For each test case, print one line containig the phrase with the abbreaviations chosen and applied.

Following, print one integer N, indicating the number of letters that was chosen words to abbreviate. In the next N lines, print the following pattern “C. = P”, where C is the initial letter and P is the chosen word for such letter. The lines should be printed in ascending order of the initial letter.
## Exemplo
| Entrada | Saída |
| ------------ | ------------- |
| hoje eu visitei meus pais | h. eu v. m. p. |
| tive que lavar meu cachorro pois ele estava fedendo | 4 |
|. | h. = hoje |
|  | m. = meus |
|  | p. = pais |
|  | v. = visitei |
|  | t. q. l. m. c. p. ele e. f. |
|  | 8 |
|  | c. = cachorro |
|  | e. = estava |
|  | f. = fedendo |
|  | l. = lavar |
|  | m. = meu |
|  | p. = pois |
|  |  q. = que |
|  | t. = tive |

# Tecnologia
- Java
- IntelliJ IDEA

# Minha Solução
Foram utilizadas duas Collections Map sendo:
~~~java
Map<String, String> mapAbb = new TreeMap<>();
~~~

Utilizada para armazenar a **Abreviação** como Key e **Palavra** como Value;

~~~java
Map<String, Integer> mapQtd = new TreeMap<>();
~~~

Utilizada para armazenar a **Palavra** como Key e o **Número de Ocorrências** como Value;

<p>A lógica para armazenar a palavra com maior número de letras abreviadas foi a seguinte:</p>

~~~java
else if ((aux.length() - 2) * cont > (mapAbb.get(aux.charAt(0) + ".").length() - 2) * mapQtd.get(aux.charAt(0) + ".")) {
~~~

# Submission URI
![URI](https://github.com/mayconlyn/assets/blob/master/Desafios/Abbreviations/Submission.png)

# Autor
Maycon Lyncoln Garcia
<p> https://www.linkedin.com/in/maycon-garcia-66a820112/
