.class public final synthetic Lz6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/l;


# instance fields
.field public final synthetic q:Lz6/b;


# direct methods
.method public synthetic constructor <init>(Lz6/b;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz6/a;->q:Lz6/b;

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    iget-object p0, p0, Lz6/a;->q:Lz6/b;

    check-cast p1, Ljava/io/IOException;

    invoke-static {p0, p1}, Lz6/b;->a(Lz6/b;Ljava/io/IOException;)Lh8/A;

    move-result-object p0

    return-object p0
.end method
