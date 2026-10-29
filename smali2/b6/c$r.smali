.class final Lb6/c$r;
.super Ljava/lang/ref/WeakReference;
.source "SourceFile"

# interfaces
.implements Lb6/c$j;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb6/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "r"
.end annotation


# instance fields
.field private final a:I

.field private final b:Lb6/c$j;


# direct methods
.method public constructor <init>(Lb6/c$g;ILb6/c$j;Ljava/lang/ref/ReferenceQueue;)V
    .registers 5

    invoke-direct {p0, p1, p4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    iput p2, p0, Lb6/c$r;->a:I

    iput-object p3, p0, Lb6/c$r;->b:Lb6/c$j;

    return-void
.end method


# virtual methods
.method public a()V
    .registers 1

    invoke-virtual {p0}, Ljava/lang/ref/Reference;->enqueue()Z

    invoke-virtual {p0}, Ljava/lang/ref/Reference;->clear()V

    return-void
.end method

.method public b()I
    .registers 1

    iget p0, p0, Lb6/c$r;->a:I

    return p0
.end method

.method public e()Lb6/c$j;
    .registers 1

    iget-object p0, p0, Lb6/c$r;->b:Lb6/c$j;

    return-object p0
.end method

.method public bridge synthetic get()Lb6/c$g;
    .registers 1

    invoke-super {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lb6/c$g;

    return-object p0
.end method
