.class public final synthetic Lz6/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/l;


# instance fields
.field public final synthetic q:Lz6/b;

.field public final synthetic r:Lz6/b$b;


# direct methods
.method public synthetic constructor <init>(Lz6/b;Lz6/b$b;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz6/c;->q:Lz6/b;

    iput-object p2, p0, Lz6/c;->r:Lz6/b$b;

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iget-object v0, p0, Lz6/c;->q:Lz6/b;

    iget-object p0, p0, Lz6/c;->r:Lz6/b$b;

    check-cast p1, Ljava/io/IOException;

    invoke-static {v0, p0, p1}, Lz6/b$b;->a(Lz6/b;Lz6/b$b;Ljava/io/IOException;)Lh8/A;

    move-result-object p0

    return-object p0
.end method
