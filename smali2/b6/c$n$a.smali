.class Lb6/c$n$a;
.super Lb6/c$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb6/c$n;->g(ILjava/lang/Object;Lb6/c$p;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/Object;

.field final synthetic c:I

.field final synthetic d:Lb6/c$j;

.field final synthetic e:I

.field final synthetic f:Lb6/c$n;


# direct methods
.method constructor <init>(Lb6/c$n;Ljava/lang/Object;ILb6/c$j;I)V
    .registers 6

    iput-object p1, p0, Lb6/c$n$a;->f:Lb6/c$n;

    iput-object p2, p0, Lb6/c$n$a;->b:Ljava/lang/Object;

    iput p3, p0, Lb6/c$n$a;->c:I

    iput-object p4, p0, Lb6/c$n$a;->d:Lb6/c$j;

    iput p5, p0, Lb6/c$n$a;->e:I

    iget-object p1, p1, Lb6/c$n;->v:Lb6/c;

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Lb6/c$f;-><init>(Lb6/c;Lb6/d;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .registers 5

    new-instance v0, Lb6/c$g;

    iget-object v1, p0, Lb6/c$n$a;->b:Ljava/lang/Object;

    invoke-direct {v0, v1, p1}, Lb6/c$g;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p0, Lb6/c$n$a;->f:Lb6/c$n;

    invoke-static {p1}, Lb6/c$n;->b(Lb6/c$n;)Lb6/c$k;

    move-result-object p1

    iget v1, p0, Lb6/c$n$a;->c:I

    iget-object v2, p0, Lb6/c$n$a;->d:Lb6/c$j;

    invoke-virtual {p1, v0, v1, v2}, Lb6/c$k;->a(Lb6/c$g;ILb6/c$j;)Lb6/c$j;

    move-result-object p1

    iget-object v0, p0, Lb6/c$n$a;->f:Lb6/c$n;

    invoke-static {v0}, Lb6/c$n;->c(Lb6/c$n;)[Lb6/c$j;

    move-result-object v0

    iget v1, p0, Lb6/c$n$a;->e:I

    aput-object p1, v0, v1

    iget-object p0, p0, Lb6/c$n$a;->f:Lb6/c$n;

    invoke-static {p0}, Lb6/c$n;->a(Lb6/c$n;)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    invoke-static {p0, p1}, Lb6/c$n;->d(Lb6/c$n;I)V

    return-void
.end method
