.class public Lb6/c$k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb6/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4
    name = "k"
.end annotation


# instance fields
.field private final a:Ljava/lang/ref/ReferenceQueue;

.field final synthetic b:Lb6/c;


# direct methods
.method protected constructor <init>(Lb6/c;)V
    .registers 2

    iput-object p1, p0, Lb6/c$k;->b:Lb6/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/lang/ref/ReferenceQueue;

    invoke-direct {p1}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    iput-object p1, p0, Lb6/c$k;->a:Ljava/lang/ref/ReferenceQueue;

    return-void
.end method


# virtual methods
.method public a(Lb6/c$g;ILb6/c$j;)Lb6/c$j;
    .registers 6

    iget-object v0, p0, Lb6/c$k;->b:Lb6/c;

    invoke-static {v0}, Lb6/c;->a(Lb6/c;)Lb6/c$l;

    move-result-object v0

    sget-object v1, Lb6/c$l;->r:Lb6/c$l;

    if-ne v0, v1, :cond_12

    new-instance v0, Lb6/c$r;

    iget-object p0, p0, Lb6/c$k;->a:Ljava/lang/ref/ReferenceQueue;

    invoke-direct {v0, p1, p2, p3, p0}, Lb6/c$r;-><init>(Lb6/c$g;ILb6/c$j;Ljava/lang/ref/ReferenceQueue;)V

    return-object v0

    :cond_12
    new-instance v0, Lb6/c$o;

    iget-object p0, p0, Lb6/c$k;->a:Ljava/lang/ref/ReferenceQueue;

    invoke-direct {v0, p1, p2, p3, p0}, Lb6/c$o;-><init>(Lb6/c$g;ILb6/c$j;Ljava/lang/ref/ReferenceQueue;)V

    return-object v0
.end method

.method public b()Lb6/c$j;
    .registers 1

    iget-object p0, p0, Lb6/c$k;->a:Ljava/lang/ref/ReferenceQueue;

    invoke-virtual {p0}, Ljava/lang/ref/ReferenceQueue;->poll()Ljava/lang/ref/Reference;

    move-result-object p0

    check-cast p0, Lb6/c$j;

    return-object p0
.end method
