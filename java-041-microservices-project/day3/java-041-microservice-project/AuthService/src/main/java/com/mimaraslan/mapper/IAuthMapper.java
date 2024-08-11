package com.mimaraslan.mapper;

import com.mimaraslan.dto.request.DoRegisterRequestDto;
import com.mimaraslan.dto.request.UserProfileSaveRequestDto;
import com.mimaraslan.model.Auth;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IAuthMapper {

    IAuthMapper INSTANCE = Mappers.getMapper( IAuthMapper.class );

//    DTO ----> Auth
//    Auth dtoToAuth(final Dto dto);

//    Auth ---> DTO
//    Dto authToDto(final Auth auth);


    Auth toAuth(final DoRegisterRequestDto dto);

 /*
    @Mappings({
            @Mapping(target = "authId", source = "id"),
            @Mapping(target = "username", source = "uname"),
            @Mapping(target = "email", source = "eposta")
    })
    */

    @Mapping(target = "authId", source = "id")
    UserProfileSaveRequestDto fromAuth (final Auth auth);

}
