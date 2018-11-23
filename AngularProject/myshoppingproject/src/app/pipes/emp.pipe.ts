import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'emp'
})
export class EmpPipe implements PipeTransform {

  transform(value: string, args?: string): string {
    if(args.toLowerCase()=="female")
    return "Mrs" +value
    else
    return 'Mr' + value



    
    return null;
  }

}
