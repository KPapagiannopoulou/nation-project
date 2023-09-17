import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})
export class RESTAPIServiceService {

  private REST_API_SERVER = "http://localhost:8080/api/v1";

  httpOptions = {
    headers: new HttpHeaders({
      
      'Content-Type': 'application/json'
    })
  };

  constructor(private httpClient: HttpClient) { }

  public sendGetRequest() {
    return this.httpClient.get(this.REST_API_SERVER +"/countries-info-sorted",this.httpOptions);
  }

  public sendGetStatsRequest() {
    return this.httpClient.get(this.REST_API_SERVER + "/countries-stats-grid", this.httpOptions);
  }

  public getSummaryGrid() {
    return this.httpClient.get(this.REST_API_SERVER + "/summary-grid", this.httpOptions);
  }

}
