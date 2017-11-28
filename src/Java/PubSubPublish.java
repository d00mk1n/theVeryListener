/**
 * Copyright 2017 Google Inc.
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package Java;

//// [START pubsub_appengine_flex_publish]
//@WebServlet(name = "Publish with PubSub", value = "/pubsub/publish")
//public class PubSubPublish extends HttpServlet {
//
//  @Override
//  public void doPost(HttpServletRequest req, HttpServletResponse resp)
//      throws IOException, ServletException {
//    Publisher publisher = this.publisher;
//    try {
//      String topicId = System.getenv("PUBSUB_TOPIC");
//      // create a publisher on the topic
//      if (publisher == null) {
//        publisher = Publisher.newBuilder(
//            TopicName.of(ServiceOptions.getDefaultProjectId(), topicId))
//            .build();
//      }
//      // construct a pubsub message from the payload
//      final String payload = req.getParameter("payload");
//      PubsubMessage pubsubMessage =
//          PubsubMessage.newBuilder().setData(ByteString.copyFromUtf8(payload)).build();
//
//      publisher.publish(pubsubMessage);
//      // redirect to home page
//      resp.sendRedirect("/");
//    } catch (Exception e) {
//      resp.sendError(HttpStatus.SC_INTERNAL_SERVER_ERROR, e.getMessage());
//    }
//  }
//// [END pubsub_appengine_flex_publish]
//
//  private Publisher publisher;
//
//  public PubSubPublish() { }
//
//  PubSubPublish(Publisher publisher) {
//    this.publisher = publisher;
//  }
//}
