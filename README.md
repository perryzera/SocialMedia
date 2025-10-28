# 🧩 Sistema de Integração de APIs de Mídia Social (Padrão Adapter)

Este projeto é uma **implementação prática e simplificada** do **padrão de projeto Adapter**, simulando a integração entre múltiplas redes sociais (Twitter, Instagram, LinkedIn e TikTok).  
O objetivo é demonstrar **boas práticas de design de software**, utilizando também os padrões **Strategy** e **Factory Method**, além de uma **configuração por ambiente**.

---

## ⚙️ Tecnologias e Padrões Utilizados

| Tecnologia / Padrão | Finalidade |
|----------------------|------------|
| ☕ **Java (JDK 17+)** | Linguagem principal |
| 🧩 **Adapter** | Unificar diferentes APIs de redes sociais em uma interface comum |
| 🧠 **Strategy** | Permitir diferentes estratégias de publicação sem alterar o código principal |
| 🏭 **Factory Method** | Criar dinamicamente o adaptador correto para a rede social desejada |
| 🌎 **Configuração por Ambiente** | Simular diferentes ambientes (ex: produção, teste) |

---

## 🚀 Como Executar o Projeto

### 1️⃣ Clonar o repositório
No terminal do VSCode:
```bash
git clone https://github.com/perryzera/SocialMedia.git
```
### 2️⃣ Acessar a pasta
```bash
cd .\SocialMedia\midia_social\
```
### 3️⃣ Executar
```bash
java .\App.java
```
### 📘 Exemplo de Saída
[TikTok] Postando vídeo: Desafio de dança!
Publicação criada com ID: tik999
Curtidas: 500 | Comentários: 80

## 💡 Conceitos Demonstrados

| Conceito | Descrição |
|-----------|------------|
| **Interface Unificada** | `AdapterMidiaSocial` define as operações básicas (publicar, obter estatísticas, etc.). |
| **Adapters Específicos** | Cada rede (Twitter, Instagram, LinkedIn e TikTok) implementa a interface de forma própria. |
| **Factory Method** | `SocialMediaFactory` escolhe automaticamente o Adapter correto de acordo com a configuração. |
| **Strategy** | O `GerenciadorMidiaSocial` permite alterar dinamicamente o comportamento de publicação. |
| **Ambiente** | `AmbienteConfig` define o contexto do sistema (ex: ambiente de teste ou produção). |

---

## 👨‍💻 Autor

**Desenvolvido por:** João Vitor Perry Tulio  
💼 **Disciplina:** Padrões de Projeto 
📚 **Professor:** Leandro Escobar
