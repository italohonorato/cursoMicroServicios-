package cl.teamweichafe.controllers;

import cl.teamweichafe.domain.MemberMeasure;
import cl.teamweichafe.services.MemberMeasureService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/memberMeasures")
@ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Request Succeeded",
                content = { @Content(mediaType = "application/json",
                        schema = @Schema(implementation = MemberMeasure.class)) }),
        @ApiResponse(responseCode = "201", description = "Resource Created",
                content = { @Content(mediaType = "application/json",
                        schema = @Schema(implementation = MemberMeasure.class)) }),
        @ApiResponse(responseCode = "400", description = "Bad Request",
                content = @Content),
        @ApiResponse(responseCode = "404", description = "Not Found",
                content = @Content) ,
        @ApiResponse(responseCode = "500", description = "Internal Server Error",
                content = @Content)})
public class MemberMeasuresController {
    private final MemberMeasureService memberMeasureService;

    public MemberMeasuresController(MemberMeasureService memberMeasureService) {
        this.memberMeasureService = memberMeasureService;
    }

    @Operation(summary = "Endpoint to add a member measure")
    @PostMapping
    public ResponseEntity<MemberMeasure> create(@RequestBody MemberMeasure userMeasure) {
        return ResponseEntity.ok(memberMeasureService.save(userMeasure));
    }

    @Operation(summary = "Endpoint to retrieve all member measures")
    @GetMapping
    public ResponseEntity<List<MemberMeasure>> get() {
        return ResponseEntity.ok(memberMeasureService.getAll());
    }

    @Operation(summary = "Endpoint to retrieve an member measure by id")
    @GetMapping("/{id}")
    public ResponseEntity<MemberMeasure> get(@PathVariable String id) {
        return ResponseEntity.ok(memberMeasureService.get(id));
    }
}
