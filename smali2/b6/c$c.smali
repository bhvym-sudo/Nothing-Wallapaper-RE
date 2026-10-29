.class Lb6/c$c;
.super Lb6/c$p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb6/c;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Ljava/lang/Object;

.field final synthetic d:Lb6/c;


# direct methods
.method varargs constructor <init>(Lb6/c;[Lb6/c$q;Ljava/lang/Object;)V
    .registers 4

    iput-object p1, p0, Lb6/c$c;->d:Lb6/c;

    iput-object p3, p0, Lb6/c$c;->c:Ljava/lang/Object;

    invoke-direct {p0, p1, p2}, Lb6/c$p;-><init>(Lb6/c;[Lb6/c$q;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lb6/c$j;Lb6/c$g;)Ljava/lang/Object;
    .registers 3

    invoke-virtual {p0, p1, p2}, Lb6/c$c;->d(Lb6/c$j;Lb6/c$g;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method protected d(Lb6/c$j;Lb6/c$g;)Ljava/lang/Boolean;
    .registers 3

    if-eqz p2, :cond_14

    invoke-virtual {p2}, Lb6/c$g;->getValue()Ljava/lang/Object;

    move-result-object p2

    iget-object p0, p0, Lb6/c$c;->c:Ljava/lang/Object;

    invoke-static {p2, p0}, Lb6/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_14

    invoke-interface {p1}, Lb6/c$j;->a()V

    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p0

    :cond_14
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p0
.end method
