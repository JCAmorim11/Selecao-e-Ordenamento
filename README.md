# Analista Java + Amazon Web Services

#### Descrição da vaga:
- Atuação com desenvolvimento de micro-serviços, em sua maioria JAVA 8 (batches, apis restful, leitores de fila, etc.);
- Integração com micro-serviços internos e de parceiros;
- Criação dos processos de entrega continua para que o código seja facilmente implantado e distribuido em produção (utilizando CodeBuild, CodeDeploy, CodePipeline);
- Desenvolvimento de aplicações serverless;

#### Necessário:
- Solido conheciemento em orientação a objeto e design patterns;
- Experiência com java8, micro-serviços, API RESTFUL, SPRING (boot);
- Experiência com banco de dados (queries básicas: select, update, inner join, etc.);
- Conhecimentos solidos nas funcionalidades basicas do git (pull, push, merge, branch, etc.);
- Inglês para leitura de documentações;

#### Diferencial:
- Experiência/Conhecimento com serverless (de preferência AWS LAMBDA);
- Experiência/Conhecimento com qualquer serviço AWS (por exemplo: SQS, API Gateway, Rekognition, RDS, DynamoDB, ECS, ECR, etc.);
- Experiência/Conhecimento com Docker;
- Experiência/Conhecimento com autenticação robusta de API (oAuth2).

-----

# Curtiu? Se candidate da seguinte maneira:

1. Clone esse repositório;
2. Construa um microserviço **springboot** (java8 ou java11) com os seguintes passos:
   - Leia o arquivo  [candidatos.json](/candidatos.json) dentro do seu micro-serviço;
   - Ordene os candidados por idade;
   - Crie um método GET que retorne esses candidados ordernados na path `http://localhost/candidados/`;
   - O método GET acima precisa receber os parâmetros opcionais `?fromAge=10&toAge=20` e apenas cadidatos nesse range de idade devem ser retornados.
3. Após realizar os passos acima mande um email com o titulo **triggdevops/job-8001** com o link do seu repositório <github.com/[[seuuser]]/[[nome_que_vc_quiser]]> para: <b>github@trigg.com.br</b>

----

#### BÔNUS
- Coloque um `Dockerfile` que execute o seu serviço para que a gente possa rodar mais facíl :smiley:

#### DICAS:
- Para facilitar nossos testes e entendimento monte um passo a passo para iniciar o seu projeto, ex: 'clone o projeto e execute docker . -p80:80'
- Caso não tenha conseguido fazer tudo que foi pedido, envie o que você fez e explique no e-mail o que aconteceu... 
- Qualquer ponto que não tenha ficado claro pode ser questionado por uma issue aqui mesmo

----

Boa sorte! "Good Luck have fun";
