# financeiro

Controle financeiro pessoal via HTTP (Projeto do livro: Programacao Funcional - Uma introducao em clojure)

## Pre-requisitos

Voce precisara do [Leiningen][] 2.0.0 ou acima instalados.

[leiningen]: https://github.com/technomancy/leiningen

## Rodando

Para iniciar o web server para a aplicacao, digite no terminal do projeto:

    lein ring server

## Testes

Para rodar os testes da aplicacao, digite no terminal:

    lein midje ou lein midje :autotest (testes automaticos)
    
## Cobertura de testes

Para verificar se os testes estao cobrindo todo o codigo, digite:

    lein cloverage --runner :midje

## License

Copyright © 2023 FIXME
