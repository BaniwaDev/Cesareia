# 📋 Requisitos Não Funcionais

Este documento descreve os requisitos não funcionais para o sistema de Gerenciamento de Bibliotecas. Estes requisitos garantem que o sistema seja eficiente, seguro e confiável, proporcionando uma boa experiência para os usuários.

---

## 🚀 Desempenho

1. **Tempo de Resposta**
    - As páginas e funcionalidades principais do sistema devem responder em até **4 segundos** para 90% das requisições, em uma rede local.
    - Consultas complexas, como relatórios gerenciais, devem ser processadas em até **8 segundos**.

2. **Escalabilidade**
    - O sistema deve suportar até **50 usuários simultâneos** em uma rede local sem degradação significativa no desempenho.
    - A arquitetura deve permitir escalabilidade para ser implantada em ambientes de nuvem com carga maior.

3. **Disponibilidade**
    - Para instalações locais, o sistema deve garantir uma **disponibilidade de 99%**, com exceção de interrupções para manutenção planejada.
    - Em ambientes na nuvem, a disponibilidade deve ser de **98,0%**.

---

## 🔒 Segurança

1. **Autenticação e Autorização**
    - O sistema deve implementar autenticação segura por meio de **credenciais exclusivas por usuário**.
    - Deve suportar diferentes níveis de acesso (ex.: administrador, operador, leitor).

2. **Proteção de Dados**
    - Dados sensíveis, como senhas, devem ser armazenados utilizando **algoritmos de hash seguros**.
    - O sistema deve proteger contra **ataques comuns**, como SQL Injection e Cross-Site Scripting (XSS).

3. **Auditoria**
    - Deve haver registro de logs para operações administrativas, como alterações no acervo ou configurações do sistema.

---

## ⚙️ Manutenibilidade

1. **Modularidade**
    - O código deve ser organizado em módulos bem definidos (ex.: controle de usuários, empréstimos, relatórios), permitindo fácil manutenção e expansão.

2. **Documentação**
    - O sistema deve incluir documentação detalhada para desenvolvedores, incluindo:
        - Instruções para configuração do ambiente.
        - Estrutura de dados e APIs.
        - Fluxo de trabalho básico.

3. **Testabilidade**
    - O sistema deve ser testável com cobertura mínima de **80% do código** em testes unitários.
    - Testes automatizados devem validar as principais funcionalidades antes de cada release.

---

## 🌐 Portabilidade

1. **Compatibilidade**
    - O sistema deve ser compatível com os sistemas operacionais **Windows**, **Linux** e **MacOS**.
    - O sistema deve funcionar corretamente em navegadores modernos como Google Chrome, Mozilla Firefox e Microsoft Edge.

2. **Implantação**
    - O sistema deve suportar instalação em ambientes locais (standalone) e implantação em servidores na nuvem, como AWS, Azure ou GCP.

---

## 📊 Usabilidade

1. **Interface Amigável**
    - A interface deve ser intuitiva e fácil de usar para usuários não técnicos, com navegação simples e fluxos lógicos.

2. **Acessibilidade**
    - O sistema deve seguir as melhores práticas de acessibilidade, garantindo que seja utilizável por pessoas com deficiências visuais ou motoras.

3. **Feedback ao Usuário**
    - Mensagens de erro e sucesso devem ser claras, orientando o usuário sobre como proceder.

---

## 💾 Requisitos Operacionais

1. **Backup e Restauração**
    - O sistema deve realizar backups automáticos do banco de dados diariamente.
    - Deve oferecer uma funcionalidade de restauração a partir de arquivos de backup.

2. **Consumo de Recursos**
    - O sistema deve operar eficientemente em máquinas com as seguintes especificações mínimas:
        - **CPU:** Dual-core 2 GHz.
        - **RAM:** 4 GB.
        - **Armazenamento:** 10 GB disponíveis.

---

## 🌟 Qualidade do Código

1. **Padrões de Código**
    - O desenvolvimento deve seguir as boas práticas de Java, utilizando ferramentas como **Checkstyle** ou **SonarQube** para análise estática.

2. **Controle de Versão**
    - Todo o código deve ser gerenciado por um sistema de controle de versão (Git), com uso consistente de branches para desenvolvimento.

3. **Automação**
    - Os pipelines de CI/CD devem incluir:
        - Build automático.
        - Execução de testes.
        - Verificação de qualidade de código.

---

## 📬 Contato para Dúvidas

Se você tiver dúvidas ou sugestões relacionadas aos requisitos não funcionais, entre em contato pelo e-mail: [SoftwareEspirita@outlook.com](mailto:SoftwareEspirita@outlook.com).
