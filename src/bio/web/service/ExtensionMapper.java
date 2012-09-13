
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.0  Built on : May 17, 2011 (04:21:18 IST)
 */

        
            package bio.web.service;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://dto.bio/xsd".equals(namespaceURI) &&
                  "FeedbackRespDto".equals(typeName)){
                   
                            return  bio.dto.xsd.FeedbackRespDto.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dto.bio/xsd".equals(namespaceURI) &&
                  "AuthorityRespDto".equals(typeName)){
                   
                            return  bio.dto.xsd.AuthorityRespDto.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dto.bio/xsd".equals(namespaceURI) &&
                  "UserRespDto".equals(typeName)){
                   
                            return  bio.dto.xsd.UserRespDto.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dto.bio/xsd".equals(namespaceURI) &&
                  "RoleDto".equals(typeName)){
                   
                            return  bio.dto.xsd.RoleDto.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dto.bio/xsd".equals(namespaceURI) &&
                  "FileServerRespDto".equals(typeName)){
                   
                            return  bio.dto.xsd.FileServerRespDto.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dto.bio/xsd".equals(namespaceURI) &&
                  "UserDto".equals(typeName)){
                   
                            return  bio.dto.xsd.UserDto.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dto.bio/xsd".equals(namespaceURI) &&
                  "UserFileServerRespDto".equals(typeName)){
                   
                            return  bio.dto.xsd.UserFileServerRespDto.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dto.bio/xsd".equals(namespaceURI) &&
                  "BaseRespDto".equals(typeName)){
                   
                            return  bio.dto.xsd.BaseRespDto.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dto.bio/xsd".equals(namespaceURI) &&
                  "AuthorityDto".equals(typeName)){
                   
                            return  bio.dto.xsd.AuthorityDto.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dto.bio/xsd".equals(namespaceURI) &&
                  "FileServerDto".equals(typeName)){
                   
                            return  bio.dto.xsd.FileServerDto.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dto.bio/xsd".equals(namespaceURI) &&
                  "RoleRespDto".equals(typeName)){
                   
                            return  bio.dto.xsd.RoleRespDto.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dto.bio/xsd".equals(namespaceURI) &&
                  "FeedbackDto".equals(typeName)){
                   
                            return  bio.dto.xsd.FeedbackDto.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    