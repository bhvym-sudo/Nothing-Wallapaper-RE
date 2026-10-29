.class public final synthetic Ld7/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF8/d0;


# instance fields
.field public final synthetic q:LF8/x0;


# direct methods
.method public synthetic constructor <init>(LF8/x0;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld7/a;->q:LF8/x0;

    return-void
.end method


# virtual methods
.method public final dispose()V
    .registers 1

    iget-object p0, p0, Ld7/a;->q:LF8/x0;

    invoke-static {p0}, Ld7/c;->a(LF8/x0;)V

    return-void
.end method
