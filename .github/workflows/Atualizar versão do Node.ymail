name: Atualizar versão do Node.js

on:
  push:
    branches:
      - main

jobs:
  atualizar-versao-node:
    runs-on: ubuntu-latest
    steps:
      - name: Verificar o repositório
        uses: actions/checkout@v2

      - name: Configurar o Node.js
        uses: actions/setup-node@v2
        with:
          node-version: '20.x'

      - name: Atualizar a ação do GitHub Pages
        run: |
          npm install -g crazy-max/ghaction-github-pages@v2.1.3

      # Adicione etapas adicionais conforme necessário
