.class Lb6/c$b;
.super Lb6/c$p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb6/c;->remove(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lb6/c;


# direct methods
.method varargs constructor <init>(Lb6/c;[Lb6/c$q;)V
    .registers 3

    iput-object p1, p0, Lb6/c$b;->c:Lb6/c;

    invoke-direct {p0, p1, p2}, Lb6/c$p;-><init>(Lb6/c;[Lb6/c$q;)V

    return-void
.end method


# virtual methods
.method protected a(Lb6/c$j;Lb6/c$g;)Ljava/lang/Object;
    .registers 3

    if-eqz p2, :cond_a

    invoke-interface {p1}, Lb6/c$j;->a()V

    invoke-static {p2}, Lb6/c$g;->a(Lb6/c$g;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_a
    const/4 p0, 0x0

    return-object p0
.end method
