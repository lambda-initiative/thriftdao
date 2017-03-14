package com.lambdalab

import org.apache.thrift.protocol.TField
import com.mongodb.casbah.Imports._

package object thriftdao {
  def $(fields: TField*) = {
    FieldSelector(fields: _*)
  }

  type FieldAssoc =  (FieldSelector, Any)
  type FieldFilter =  (FieldSelector, DBObject)
}


