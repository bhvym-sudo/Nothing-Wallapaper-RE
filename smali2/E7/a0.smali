.class public final synthetic LE7/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/a;


# instance fields
.field public final synthetic q:LE7/c0;


# direct methods
.method public synthetic constructor <init>(LE7/c0;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LE7/a0;->q:LE7/c0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 1

    iget-object p0, p0, LE7/a0;->q:LE7/c0;

    invoke-static {p0}, LE7/c0;->a(LE7/c0;)LH3/k;

    move-result-object p0

    return-object p0
.end method
