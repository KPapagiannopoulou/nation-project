import { Component, OnInit } from '@angular/core';
import { RESTAPIServiceService } from '../restapiservice.service';

interface CountryStat {
  name: string;
  country_code3: string;
  year: number;
  population: number;
  gdp: number;
}


@Component({
  selector: 'app-stats',
  templateUrl: './stats.component.html',
  styleUrls: ['./stats.component.css']
})
export class StatsComponent implements OnInit {
  stats: CountryStat[] = [];

  constructor(private restapiservice: RESTAPIServiceService) { }

  ngOnInit() {

    this.restapiservice.sendGetStatsRequest().subscribe((data: any) => {
      console.log(data);
      this.stats = data as CountryStat[];
    })
  }
}
