.class public final Lm8/f$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm8/i$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field static final synthetic q:Lm8/f$b;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, Lm8/f$b;

    invoke-direct {v0}, Lm8/f$b;-><init>()V

    sput-object v0, Lm8/f$b;->q:Lm8/f$b;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
