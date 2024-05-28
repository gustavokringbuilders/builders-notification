# builders-notification
Poc para necessidade de notificações de acordo com necessidade da dpsp

-  Modularizar demanda de criação de notificações a partir de chamadas sincronas ou async (api = http, processor = amqp/outros).
-  Realizar integração com firebase para inserir notificação recebida por meio do módulo API ou Processor.
-  Módulo API - Ficará responsavel pela opção de cadastro de notificação via POST e listagem de todas as notificações criadas por intervalo de tempo GET.
-  Módulo Processor - Esqueleto de recebimento de evento de notificação via Kafka, RabbitMQ, Solução GCP/outros e o cadastro da notificação.
-  Criar também fluxo reativo para solução.
