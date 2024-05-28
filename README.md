## iPhone 2017 Functionality

### Descrição
Este projeto faz parte do desafio da formação em Java da DIO . Ele implementa as funcionalidades básicas de um iPhone, incluindo reprodutor musical, aparelho telefônico e navegador na internet, utilizando Java e conceitos de Programação Orientada a Objetos.
![image](https://github.com/teofilonicolau/dio_lancamento_-iPhone_2007/assets/97030160/b54ca592-f366-4385-a5cb-687d904e5db5)

### Estrutura do Projeto
- `com.iphone2017.interfaces`: Contém as interfaces para controle de mídia, telefonia e navegação web.
- `com.iphone2017.implementations`: Contém as implementações das interfaces.
- `com.iphone2017.tests`: Contém a classe principal para testar as funcionalidades.
- ![image](https://github.com/teofilonicolau/dio_lancamento_-iPhone_2007/assets/97030160/1e82d366-deef-4c10-b31f-74e99a9e1661)


### Diagrama UML e Como Executar
```mermaid
classDiagram
    class MediaControl {
        +play()
        +pause()
        +stop()
    }

    class ReprodutorMusical {
        +tocarMusica()
        +pausarMusica()
    }

    class Telefonia {
        +fazerChamada()
        +receberChamada()
    }

    class AparelhoTelefonico {
        +enviarMensagem()
        +receberMensagem()
    }

    class NavegacaoWeb {
        +abrirPagina()
        +adicionarFavorito()
    }

    class NavegadorInternet {
        // Vazio
    }

    MediaControl <|-- ReprodutorMusical
    Telefonia <|-- AparelhoTelefonico
    NavegacaoWeb <|-- NavegadorInternet
```

## Como Executar
Clone o repositório:
```sh
git clone https://github.com/teofilonicolau/dio_lancamento_-iPhone_2007.git
