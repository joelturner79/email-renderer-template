/*
 * Copyright 2016 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.emailrenderertemplate.preview

import uk.gov.hmrc.emailrenderertemplate.controllers.model.Params

object TemplateParams extends TemplateParams {
}

trait TemplateParams {
  def paramsFor(templateId: String): Params = sampleTemplateParameters(templateId)

  val sampleTemplateParameters: Map[String, Params] = Map(
    "sample1" -> Params(Map("name" -> "Mr. Hyde")),
    "sample2" -> Params(Map("name" -> "Dr. Jekyll"))
  )
}
