package cn.jbone.eb.portal.api;


import cn.jbone.common.api.dto.SearchListDTO;
import cn.jbone.common.rpc.Result;
import cn.jbone.eb.portal.api.dto.response.OperationPositionListByPageResponseDTO;
import cn.jbone.eb.portal.api.dto.response.OperationPositionRequestDTO;
import cn.jbone.eb.portal.api.dto.response.OperationPositionResponceDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/operationPosition")
public interface OperationPositionApi {
    @PostMapping(value = "/findByPage", consumes = MediaType.APPLICATION_JSON_VALUE)
    Result<OperationPositionListByPageResponseDTO> findByPage(@RequestBody SearchListDTO searchListDTO);

    @PostMapping(value = "/save", consumes = MediaType.APPLICATION_JSON_VALUE)
    Result<Void> save(@RequestBody OperationPositionRequestDTO operationPositionRequestDTO);

    @PostMapping(value = "/update", consumes = MediaType.APPLICATION_JSON_VALUE)
    Result<Void> update(@RequestBody OperationPositionRequestDTO operationPositionRequestDTO);

    @GetMapping(value = "/findById", consumes = MediaType.APPLICATION_JSON_VALUE)
    Result<OperationPositionResponceDTO> findById(@RequestBody Integer id);

    @DeleteMapping(value = "/delete", consumes = MediaType.APPLICATION_JSON_VALUE)
    Result<Void> delete(@RequestBody String ids);
}
